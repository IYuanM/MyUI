# MyUI
实验三
### 第一题：
* 利用 SimpleAdapter 实现题目要求的列表效果，先创建一个空的ListView，然后创建一个线性布局，
里面规划好文字和图片的布局，然后利用SimpleAdapter将线性布局填充并且注入到ListView中。即可
完成最基本的布局。<br>
* 利用Android中的listSelector属性：android:listSelector="#1D1212"，便可以改变列表某一项
被选中后的颜色。<br>
* 最后利用Toast组件显示选中后的提示信息。<br>
最后成果截图：<br>
![mage texxt](https://github.com/IYuanM/MyUI/blob/main/pictures/1.1.PNG)<br>
![mage texxt](https://github.com/IYuanM/MyUI/blob/main/pictures/1.2.PNG)<br>
### 第二题：
* 创建一个最普通的线性布局，添加一个触发对话框的按钮<br>
* 创建线性布局xml文件，需要添加ImaView加入对话框的头部图片，然后是两个文本输入组件，最后镶
嵌一个垂直布局的线性布局，添加两个按钮。在drawable中创建button2.xml文件，旨在为设计按钮形式。
此处采用分层的方法，边框为黑色，次外层为白色，最内层为白色。按照一定比例调整他们的范围，从而
达到图示的按钮形式。<br>
* 利用AlertDialog.Builder 对象上的 setView() 将布局添加到AlertDialog，绑定事件后，点击提
示按钮即可弹出题目中的对话框。<br>
最后成果截图：<br>
![mage texxt](https://github.com/IYuanM/MyUI/blob/main/pictures/2.1.PNG)<br>
### 第三题：
* 首先最普通的线性布局显示测试内容<br>
* 直接在java类中添加Menu接口，以及实现类MenuItem，为每一个要求添加标价，被选中后根据标记做
出相应即可。<br>
最后成果截图：<br>
![mage texxt](https://github.com/IYuanM/MyUI/blob/main/pictures/3.1.PNG)<br>
### 第四题：
* 首先创建和第一题类似的ListView以及一个带有题目中的小绿人的线性布局，然后利用SelectionAdapter
将其注入到列表中，达到题目中的界面效果。<br>
* 调用ActionMode类实现界面顶部显示上下文菜单的效果，然后通过菜单实现类MenuItem绑定相应的事件最
后达到题目中的效果。<br>
最后成果截图：<br>
![mage texxt](https://github.com/IYuanM/MyUI/blob/main/pictures/4.1.PNG)
