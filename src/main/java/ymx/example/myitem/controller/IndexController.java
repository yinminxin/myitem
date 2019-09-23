package ymx.example.myitem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinminxin
 * @description 主页
 * @date 2019/9/19 9:51
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

    /**
     * @api {get} /index 主页
     * @apiName index1
     * @apiDescription 返回主页页面
     * @apiGroup index
     *
     * @apiParam {Number} id Users unique ID.
     *
     * @apiSuccess {String} firstname Firstname of the User.
     * @apiSuccess {String} lastname  Lastname of the User.
     */
    @GetMapping("indexView")
    public String indexView(){
        LOG.info("--------------主页视图---------------");
        return "index";
    }

    /**
     * @api {post}/index/getParamDemo 根据参数返回结果
     * @apiName getParamDemo
     * @apiDescription 根据参数返回结果
     * @apiGroup index
     * @apiParam {String} param 参数
     * @apiParamExample {json} Request-Example:
    {
    "param": "yinminxin"
    }
     * @apiSuccess {String} id 数据ID
     * @apiSuccess {String} firstname 数据firstname
     * @apiSuccess {String} lastname 数据lastname
     * @apiSuccessExample {json} Success-Response:
    {
    "firstname": "yinminxinfirstname",
    "id": "yinminxin",
    "lastname": "yinminxinlastname"
    }
     */
    @PostMapping("getParamDemo")
    public ResponseEntity getParamDemo(@RequestParam("param") String param){
        Map<String, Object> map = new HashMap<>();
        map.put("id",param);
        map.put("firstname",param + "firstname");
        map.put("lastname",param + "lastname");
        return ResponseEntity.ok(map);
    }
}
