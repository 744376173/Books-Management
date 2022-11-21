<template>

  <div id="app">
    <!-- 头部开始 -->
    <div class="header">
        <img class="logo" src="@/assets/loga.png" alt="">
        <span>图书馆里系统</span>
    </div>
    <!-- 侧边栏和主体 -->
    <div style="display:flex">
    <!-- 侧边栏 开始 -->
    <div class="sidebar">
        <!-- 侧边栏导航开始 -->
        <!-- $route.path使用当前页路由 -->
        <el-menu :default-active="$route.path" router :default-openeds="['/']" class="el-menu-demo" >
            <!-- 默认展开的菜单 :default-openeds -->
            <el-menu-item index="/">
                <i class="el-icon-eleme"></i>
                首页
            </el-menu-item>
            <el-submenu>
                <template slot="title">
                    <i class="el-icon-position"></i>
                    关于
                </template>
                <el-menu-item index="/about">
                    <i class="el-icon-chat-dot-round"></i>
                    关于详情
                </el-menu-item>
            </el-submenu>
        </el-menu>
    </div>
    <!-- 主体数据 开始 -->
    <div class="main">
    <router-view/><!-- 渲染路由<router-view/> -->

    </div>
    </div>
  </div>
</template>

<style>
/* 头部 */
.header{
    height: 60px;
    line-height: 60px;
    background-color: white;
    margin-bottom: 2px;
}
.logo{
    width: 40px;
    position: relative;
    top: 10px;
    left: 20px;
}
.header span{
    font-size: 25px;
    margin-left: 25px;
}
/* 侧边栏 */
.sidebar{
    width: 200px;
    overflow: hidden;
    margin-right: 2px;
    background-color: white;
    min-height: calc(100vh - 60px);/* 最小高度 全屏高度减去头部 */
}
/* 主体 */
.main{
    flex: 1;
    background-color: white;
}
</style>
