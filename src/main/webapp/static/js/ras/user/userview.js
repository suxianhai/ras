/**
 * 显示用户信息demo
 */
define(function(require, exports, module) {

	var utils = require('ras/utils');
	var UserModel = require('ras/user/usermodel');
	var UserView = Backbone.View.extend({
		initialize : function(options) {//构造方法
			this.el  = '#mainContainer'; //定义页面的div容器的id 
			this.$el  = $(this.el); 
			this.tpl = utils.template('user.userpage',{'name':"传递json数组参数到模板页"});//获取HTML页面模板
			this.$el.html(this.tpl);//将html片段插入到指定dom元素中;
			
			this.model = new UserModel(options);//实例化view对应的model
			utils.layout('#testDiv');//设置滚动条
		},
		delegateEvents:function(){
			var view = this;
			var model = this.model;
			
			//可在这里定义页面的绑定事件，
		},
	
		//渲染页面的方法
		render : function(){
			utils.confirm("你大爷",function(flag){
				if(flag){
					utils.notify('11');
					utils.alert(222);
				}
			});
		}
	});

	module.exports = UserView;
})
