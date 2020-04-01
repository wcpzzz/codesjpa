package com.codes.api.login;
import com.codes.api.BaseController;
import com.codes.core.model.R;
import com.codes.dao.login.model.Allmethod;
import com.codes.dao.login.model.Analysis;
import com.codes.dao.login.model.Login;
import com.codes.dao.login.model.Allgp;
import com.codes.dao.login.req.*;
import com.codes.service.login.AllgpService;
import com.codes.service.login.AllmethodService;
import com.codes.service.login.AnalysisService;
import com.codes.service.login.LoginService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;


/**
 * @author
 * @date 2020/02/26 16:54
 */
@RestController
@RequestMapping("/gupiao")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private AllgpService allgpService;
    @Autowired
    private AnalysisService analysisService;
    @Autowired
    private AllmethodService allmethodService;
    @PostMapping("/login")
//    public Login login(@RequestParam(value = "account", required = false) String account,
//                       @RequestParam(value = "password", required = false) String password) {
    public R<List<Login>> login(@RequestBody(required = false) LoginReq loginReq) {
        String account = loginReq.getAccount();
        String password = loginReq.getPassword();
        Login login = loginService.findByAccountAndPassword(account, password);
        if (login != null) {
            return R.data(login);
        } else {
            return null;
        }
    }
//    analysis删除
    @GetMapping("/del/{id}")
    public R delById(@PathVariable int id) {
        analysisService.deleteById(id);
        return R.success();
    }


//    gpid和gpname查单个股票
    @PostMapping("/allgp")
    public R<List<Allgp>> allgp(@RequestBody(required = false) AllgpReq allgpReq) {
        String gpid = allgpReq.getGpid();
        String gpname = allgpReq.getGpname();
        Allgp allgp = allgpService.findByGpidAndGpname(gpid, gpname);
        if (allgp != null) {
            return R.data(allgp);
        } else {
            return null;
        }
    }
    //全部股票
    @PostMapping("/allgp2")
    public R<List<Allgp>> allgp2(@RequestBody(required = false) AllgpReq allgpReq) {
        List<Allgp> allgp = allgpService.findAll();
        if (allgp != null) {
            return R.data(allgp);
        } else {
            return null;
        }
    }
    //全部分析
    @PostMapping("/analysisAll")
    public R<List<Analysis>> analysis(@RequestBody(required = false) Analysis analysisReq) {
        String account = analysisReq.getAccount();
        List<Analysis> analysis = analysisService.findAll(account);
        if (analysis != null) {
            return R.data(analysis);
        } else {
            return null;
        }
    }
    //全部分析
    @PostMapping("/analysisOne")
    public R<Analysis> analysisOne(@RequestBody(required = false) Analysis analysisReq) {
        String gpid = analysisReq.getGpid();
        String method = analysisReq.getMethod();
        Analysis analysis = analysisService.findByGpidAndMethod(gpid,method);
        if (analysis != null) {
            return R.data(analysis);
        } else {
            return null;
        }
    }
    //全部方法
    @PostMapping("/allmethod")
    public R<List<Allmethod>> allmethod(@RequestBody(required = false) Allmethod allmethodReq) {
        List<Allmethod> allmethod = allmethodService.findAll();
        if (allmethod != null) {
            return R.data(allmethod);
        } else {
            return null;
        }
    }
    //新建分析
    @PostMapping("/analysisCreate")
    public R analysis(@RequestBody(required = false) AnalysisReq req) {
        return R.data(analysisService.create(req));
    }


    @PostMapping("/register")
    public R register(@RequestBody(required = false) LoginReq req) {
        return R.data(loginService.create(req));
    }
    @PostMapping("/showK")
    public R showK(@RequestBody(required = false) ShowKReq req) {
        loginService.showK(req.getKaddr(), req.getKnum());
        return R.data(req);
    }

    /**
     * 根据ID查询
     *
     * @author
     * @date 2020/02/26 16:54
     */

    @GetMapping("/{id}")
    public R<Login> findById(@PathVariable String id) {
        return R.data(loginService.findById(id));
    }

    /**
     * 根据ID集查询
     *
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/batch/{ids}")
    public R<List<Login>> findByIds(@PathVariable String ids) {
        if (StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<String> idList = new ArrayList<>();
            for (String id : idArray) {
                idList.add(id.trim());
            }
            return R.data(loginService.findByIds(idList));
        }
        return R.success();
    }

    /**
     * 创建
     *
     * @author
     * @date 2020/02/26 16:54
     */
    @PostMapping("/create")
    public R create(LoginReq req) {
        return R.data(loginService.create(req));
    }

    /**
     * 根据ID删除
     *
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable String id) {
        loginService.deleteById(id);
        return R.success();
    }

    /**
     * 根据ID集删除
     *
     * @author
     * @date 2020/02/26 16:54
     */
    @GetMapping("/delete/batch/{ids}")
    public R deleteByIds(@PathVariable String ids) {
        if (StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<String> idList = new ArrayList<>();
            for (String id : idArray) {
                idList.add(id.trim());
            }
            loginService.deleteByIds(idList);
        }
        return R.success();
    }

    /**
     * 根据ID更新
     *
     * @author
     * @date 2020/02/26 16:54
     */
    @PostMapping("/changePwd")
    public R updateById(@RequestBody(required = false) LoginReq req) {
        loginService.updateById(req);
        return R.success();
    }
}
