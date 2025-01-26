package com.ruoyi.project.system.wechat.mapper;

import com.ruoyi.project.system.wechat.domain.TWechat;

import java.util.List;

/**
 * 部门微信Mapper接口
 *
 * @author fuxp3
 * @date 2025-01-19
 */
public interface TWechatMapper
{
    /**
     * 查询部门微信
     *
     * @param id 部门微信主键
     * @return 部门微信
     */
    public TWechat selectTWechatById(Long id);

    /**
     * 查询部门微信列表
     *
     * @param tWechat 部门微信
     * @return 部门微信集合
     */
    public List<TWechat> selectTWechatList(TWechat tWechat);

    /**
     * 新增部门微信
     *
     * @param tWechat 部门微信
     * @return 结果
     */
    public int insertTWechat(TWechat tWechat);

    /**
     * 修改部门微信
     *
     * @param tWechat 部门微信
     * @return 结果
     */
    public int updateTWechat(TWechat tWechat);

    /**
     * 删除部门微信
     *
     * @param id 部门微信主键
     * @return 结果
     */
    public int deleteTWechatById(Long id);

    /**
     * 批量删除部门微信
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTWechatByIds(String[] ids);
}
