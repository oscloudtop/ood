<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vog1g
  Date: 2017/5/5
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}-内涵三十秒</title>
    <jsp:include page="home_include.jsp"/>
    <c:if test="${!playurl.get(0).cdn_url.contains('/st/mp4/')}">
        <link rel="stylesheet" type="text/css"
              href="http://g.alicdn.com/de/prismplayer/1.7.6/skins/default/index-min.css">
        <script src="http://g.alicdn.com/de/prismplayer/1.7.6/prism-min.js"></script>
        <script>

            function InitPlayer(){
                var player = new prismplayer({
                    id: "J_prismPlayer",    // 容器id

                    source: '${playurl.get(0).cdn_url}',  // 视频url 支持互联网可直接访问的视频地址
                    autoplay: true,       // 自动播放
                    width: "1120px",        // 播放器宽度
                    height: "630px"      // 播放器高度
                });
            }
        </script>

    </c:if>
</head>
<body class="play-body">
<%--菜单--%>
<div class="neihan-nav">
    <nav class="layui-header">
        <div class="neihan-container">

            <!-- 调用站点首页 -->
            <a class="neihan-logo" href="/"> <img src="${webRoot}/images/logo.png"/></a>
            <!-- 导航菜单 -->
            <div class="play-nav">
            <span class="layui-breadcrumb">
                <a href="/">首页</a>
                 <a href="#">${owntypename}</a>
                <a><cite>${title}</cite></a>
            </span>
            </div>
        </div>
    </nav>
</div>
<div class="video-postion">
    <c:if test="${playurl.get(0).cdn_url.contains('/st/mp4/')}">
        <video width="1120" height="630" controls="" autoplay="true" poster="${recommend.mPic}">
            <c:forEach items="${playurl}" var="item">
                <source src="${item.cdn_url}" type="video/mp4">
            </c:forEach>
        </video>
    </c:if>


    <c:if test="${!playurl.get(0).cdn_url.contains('/st/mp4/')}">
        <div id='J_prismPlayer' class='prism-player'></div>
    </c:if>
    <div class="bdsharebuttonbox"><a href="#" class="bds_more" data-cmd="more"></a><a href="#" class="bds_qzone" data-cmd="qzone"></a><a href="#" class="bds_tsina" data-cmd="tsina"></a><a href="#" class="bds_tqq" data-cmd="tqq"></a><a href="#" class="bds_renren" data-cmd="renren"></a><a href="#" class="bds_weixin" data-cmd="weixin"></a></div>
    <script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdPic":"","bdStyle":"0","bdSize":"16"},"share":{},"image":{"viewList":["qzone","tsina","tqq","renren","weixin"],"viewText":"分享到：","viewSize":"16"},"selectShare":{"bdContainerClass":null,"bdSelectMiniList":["qzone","tsina","tqq","renren","weixin"]}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
</div>
<div class="subplay">
    <div class="video-other">
        <%--评论区--%>
        <div class="play-mainCol">
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>看官评论区</legend>
            </fieldset>

            <form class="layui-form" action="">
                <div class="layui-form-item layui-form-text">

                    <div class="layui-input-block">
                        <textarea class="layui-textarea layui-hide" name="content" lay-verify="content"
                                  id="Discuss"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit="" lay-filter="submit-discuss">提交</button>
                    </div>
                </div>
            </form>


        </div>

        <%--相关推荐--%>
        <div class="play-sideCol">
            <div class="v_like">
                <div class="tit"><strong>随机推荐</strong>
                </div>
                <div class="list">
                    <ul>
                        <c:forEach items="${othervideos}" var="recommend">

                            <li>
                                <a class="v_pic" href="/v_show/id_${recommend.mPlayurl}"><img
                                        class="scrollLoading"
                                        onerror="this.onerror=null;this.src='/images/timg.gif';"

                                        src="${recommend.mPic}" style="display: block;"></a>
                                <a class="v_title" href="/v_show/id_${recommend.mPlayurl}">${recommend.mName}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>

    </div>

</div>


<jsp:include page="home_foot.jsp"/>
<script>
    layui.use(['element', 'form', 'layedit', 'laydate'], function () {
        var element = layui.element(); //导航的hover效果、二级菜单等功能，需要依赖element模块
        var form = layui.form()
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;
        //监听导航点击
        element.on('nav(demo)', function (elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });

        //创建一个编辑器
        var editIndex = layedit.build('Discuss', {
            tool: ['strong', 'italic', 'left', 'center', 'right', '|', 'face']
        });

        //自定义验证规则
        form.verify({
            content: function (value) {
                if (value.length < 5) {
                    return '内容至少得5个字符啊';
                }
                layedit.sync(editIndex);
            }
        });

        //监听提交
        form.on('submit(submit-discuss)', function (data) {
//            layer.alert(data.field, {
//                title: '最终的提交信息'
//            })
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

    });
</script>
<c:if test="${!playurl.get(0).cdn_url.contains('/st/mp4/')}">
<script type="text/javascript">InitPlayer()</script>
</c:if>
</body>
</html>
