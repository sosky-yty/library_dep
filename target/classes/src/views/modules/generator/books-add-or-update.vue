<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="" prop="bookName">
      <el-input v-model="dataForm.bookName" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="bookPress">
      <el-input v-model="dataForm.bookPress" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="bookInventory">
      <el-input v-model="dataForm.bookInventory" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="bookAuthor">
      <el-input v-model="dataForm.bookAuthor" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="currentInventory">
      <el-input v-model="dataForm.currentInventory" placeholder=""></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          bookId: 0,
          bookName: '',
          bookPress: '',
          bookInventory: '',
          bookAuthor: '',
          currentInventory: ''
        },
        dataRule: {
          bookName: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          bookPress: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          bookInventory: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          bookAuthor: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          currentInventory: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.bookId = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.bookId) {
            this.$http({
              url: this.$http.adornUrl(`/generator/books/info/${this.dataForm.bookId}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.bookName = data.books.bookName
                this.dataForm.bookPress = data.books.bookPress
                this.dataForm.bookInventory = data.books.bookInventory
                this.dataForm.bookAuthor = data.books.bookAuthor
                this.dataForm.currentInventory = data.books.currentInventory
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/generator/books/${!this.dataForm.bookId ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'bookId': this.dataForm.bookId || undefined,
                'bookName': this.dataForm.bookName,
                'bookPress': this.dataForm.bookPress,
                'bookInventory': this.dataForm.bookInventory,
                'bookAuthor': this.dataForm.bookAuthor,
                'currentInventory': this.dataForm.currentInventory
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
