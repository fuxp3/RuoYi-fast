package com.ruoyi.project.system.wechat.service;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.system.wechat.domain.TWechat;
import com.ruoyi.project.system.wechat.mapper.TWechatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门微信Service业务层处理
 *
 * @author fuxp3
 * @date 2025-01-19
 */
@Service
public class TWechatServiceImpl implements ITWechatService
{
    @Autowired
    private TWechatMapper tWechatMapper;

    /**
     * 查询部门微信
     *
     * @param id 部门微信主键
     * @return 部门微信
     */
    @Override
    public TWechat selectTWechatById(Long id)
    {
        return tWechatMapper.selectTWechatById(id);
    }

    /**
     * 查询部门微信列表
     *
     * @param tWechat 部门微信
     * @return 部门微信
     */
    @Override
    public List<TWechat> selectTWechatList(TWechat tWechat)
    {
        return tWechatMapper.selectTWechatList(tWechat);
    }

    /**
     * 新增部门微信
     *
     * @param tWechat 部门微信
     * @return 结果
     */
    @Override
    public int insertTWechat(TWechat tWechat)
    {
        tWechat.setCreateTime(DateUtils.getNowDate());
        return tWechatMapper.insertTWechat(tWechat);
    }

    /**
     * 修改部门微信
     *
     * @param tWechat 部门微信
     * @return 结果
     */
    @Override
    public int updateTWechat(TWechat tWechat)
    {
        tWechat.setUpdateTime(DateUtils.getNowDate());
        return tWechatMapper.updateTWechat(tWechat);
    }

    /**
     * 批量删除部门微信
     *
     * @param ids 需要删除的部门微信主键
     * @return 结果
     */
    @Override
    public int deleteTWechatByIds(String ids)
    {
        return tWechatMapper.deleteTWechatByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除部门微信信息
     *
     * @param id 部门微信主键
     * @return 结果
     */
    @Override
    public int deleteTWechatById(Long id)
    {
        return tWechatMapper.deleteTWechatById(id);
    }
}

