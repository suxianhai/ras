define(function(require, exports, module){

	var UserModel = Backbone.Model.extend({
		pageNo:1,
		pageSize:10,
		initialize : function(options){//构造方法
			this.options = options||{};
		},
		/**
		 * 查询用户信息
		 * @param callback
		 */
		search : function(param, callback) {
			$.ajax({
				type : 'post',
				url : '/user/index.json',
				dataType : 'json',
				data : param,
				success : function(data) {
					if (callback)
						callback(data);
				}
			});
		}
	});
	module.exports = UserModel;
})
