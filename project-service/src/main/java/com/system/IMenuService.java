package com.system;

import com.baomidou.mybatisplus.service.IService;
import com.entity.Menu;

import java.util.List;

/**
 * @author maxl
 * @time 2018-12-17
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据 Ids 查询
     * @param permissionIds ids
     * @return  权限List
     */
    List<Menu> selectByIds(List<Integer> permissionIds);

    /**
     * 根据角色查询菜单
     * @param roleCode 角色主键
     * @return
     */
    List<Menu> findMenuByRoleCode(String roleCode);

    /**
     * 获取菜单树形结构
     * @param pId
     * @param list
     * @return
     */
    List<Menu> treeMenuList(String pId, List<Menu> list);


}
