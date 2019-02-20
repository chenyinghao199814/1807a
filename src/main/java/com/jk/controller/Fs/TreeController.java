package com.jk.controller.Fs;

import com.jk.bean.TreeBean;
import com.jk.service.Fs.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    /**
     * <pre>getMyTree(左侧树展示)
     * 创建人：范帅 1440225507@qq.com
     * 创建时间：2019年1月2日 下午7:14:49
     * 修改人：范帅 1440225507@qq.com
     * 修改时间：2019年1月2日 下午7:14:49
     * 修改备注： ·
     * @return</pre>
     */

    @RequestMapping("getMyTree")
    @ResponseBody
    public List<TreeBean> getMyTree(){
        return treeService.getMyTree();
    }
}
