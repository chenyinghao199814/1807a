package com.jk.service.serviceImpl;

import com.jk.bean.TreeBean;
import com.jk.mapper.Fs.TreeMapper;
import com.jk.service.Fs.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;

    @Override
    public List<TreeBean> getMyTree() {
        int id = 0;
        List<TreeBean> fsTreeNode = fsTreeNode(id);
        return fsTreeNode;
    }
    private List<TreeBean> fsTreeNode(int id) {
        List<TreeBean> myTree = treeMapper.getMyTree(id);
        for (TreeBean treeBean : myTree) {
            Integer id2 = treeBean.getId();
            List<TreeBean> fsTreeNode = fsTreeNode(id2);
            if (fsTreeNode==null || fsTreeNode.size()<=0) {
                treeBean.setSelectable(true);

            }else {
                treeBean.setSelectable(false);
                treeBean.setNodes(fsTreeNode);
            }
        }
        return myTree;
    }
}
