package com.ruoyi.project.system.wechat.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.wechat.domain.TWechat;
import com.ruoyi.project.system.wechat.service.ITWechatService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门微信Controller
 *
 * @author fuxp3
 * @date 2025-01-19
 */
@Controller
@RequestMapping("/system/wechat")
public class TWechatController extends BaseController
{
    private String prefix = "system/wechat";

    @Autowired
    private ITWechatService tWechatService;

    @RequiresPermissions("system:wechat:view")
    @GetMapping()
    public String wechat()
    {
        return prefix + "/wechat";
    }

    /**
     * 查询部门微信列表
     */
    @RequiresPermissions("system:wechat:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TWechat tWechat)
    {
        startPage();
        List<TWechat> list = tWechatService.selectTWechatList(tWechat);
        return getDataTable(list);
    }

    /**
     * 导出部门微信列表
     */
    @RequiresPermissions("system:wechat:export")
    @Log(title = "部门微信", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TWechat tWechat)
    {
        List<TWechat> list = tWechatService.selectTWechatList(tWechat);
        ExcelUtil<TWechat> util = new ExcelUtil<TWechat>(TWechat.class);
        return util.exportExcel(list, "部门微信数据");
    }

    /**
     * 新增部门微信
     */
    @RequiresPermissions("system:wechat:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存部门微信
     */
    @RequiresPermissions("system:wechat:add")
    @Log(title = "部门微信", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TWechat tWechat)
    {
        return toAjax(tWechatService.insertTWechat(tWechat));
    }

    /**
     * 修改部门微信
     */
    @RequiresPermissions("system:wechat:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TWechat tWechat = tWechatService.selectTWechatById(id);
        mmap.put("tWechat", tWechat);
        return prefix + "/edit";
    }

    /**
     * 修改保存部门微信
     */
    @RequiresPermissions("system:wechat:edit")
    @Log(title = "部门微信", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TWechat tWechat)
    {
        return toAjax(tWechatService.updateTWechat(tWechat));
    }

    /**
     * 删除部门微信
     */
    @RequiresPermissions("system:wechat:remove")
    @Log(title = "部门微信", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tWechatService.deleteTWechatByIds(ids));
    }
}

