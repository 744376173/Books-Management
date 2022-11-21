<template>
  <div class="home">
    <!-- 搜索表单 -->
    <div>
        <el-input style="width:240px" placeholder="输入名称"></el-input>
        <el-input style="width:240px;margin-left:5px;" placeholder="输入联系方式"></el-input>
        <el-button style="margin-left:5px" type="primary"> <i class="el-icon-search"></i>搜索</el-button>
    </div>
    <!-- 主体数据 -->
    <el-table :data="tableData" stripe>
        <!-- stripe给表格添加斑马线 -->
        <el-table-column prop="name" label="名称"></el-table-column>
        <el-table-column prop="age" label="年龄"></el-table-column>
        <el-table-column prop="address" label="地址"></el-table-column>
        <el-table-column prop="phone" label="手机"></el-table-column>
        <el-table-column prop="sex" label="性别"></el-table-column>
    </el-table>
    <!-- 分页开始 -->
    <el-pagination background 
    layout="prev, pager, next" 
    :page-size="10"
    :total="tableData.length">
    </el-pagination>
  </div>
</template>

<script>

export default {
    name: 'HomeView',
    data() {
        return {
            tableData: []
    }
  },
  created() {
      this.load() //在页面加载后去使用此方法
  },
  methods:{
      load(){ //获取数据库的数据 并转json格式 再转成对象 并赋值给tableDate
        fetch('http://localhost:9090/user/list').then(res => res.json()).then(res =>{
          console.log(res)
          this.tableData = res
        })
      }
  }
}
</script>
