package cn.oddcloud;

/**
 * Created by vog1g on 2017/4/24.
 */
public class MusicProject {
    /**
     *
     *
     *XPath 快速学习笔记
     * 由于一个内涵三十秒项目用的上所以要学习一下。
     *
     *  提前说下：内涵三十秒是一个专注搞笑的视频网站，其网站风格采用小清新版，类似与音悦台那种风格，本人要做这个项目也是突发奇想
     *          ，当然这个也是为了准备要交的期末大作业
     *
     *
     *
     */
    /**

     表达式	描述
     nodename	选取此节点的所有子节点。
     /	        从根节点选取。
     //	        从匹配选择的当前节点选择文档中的节点，而不考虑它们的位置。
     .	        选取当前节点。
     ..	        选取当前节点的父节点。
     @	        选取属性。


     *	        匹配任何元素节点。
     @*	        匹配任何属性节点。
     node()	    匹配任何类型的节点。

     通过在路径表达式中使用“|”运算符，您可以选取若干个路径。

     位置路径可以是绝对的，也可以是相对的。
     绝对路径起始于正斜杠( / )，而相对路径不会这样

     text() 文本内容


     运算符	    描述	            实例	                          返回值
     |	    计算两个节点集	    //book | //cd	        返回所有book 和 cd 元素的节点集
     +	        加法          	6 + 4	                      10
     -	        减法	            6 - 4                     	   2
      *     	乘法	            6 * 4	                      24
     div	    除法	            8 div 4                   	  2
     =	        等于          	price=9.80                如果 price 是 9.80，则返回 true。如果 price 是 9.90，则返回 false。
     !=	        不等于         	price!=9.80               如果 price 是 9.90，则返回 true。如果 price 是 9.80，则返回 false。
     <	        小于	            price<9.80                如果 price 是 9.00，则返回 true。如果 price 是 9.90，则返回 false。
     <=	        小于或等于	    price<=9.80               如果price 是 9.00，则返回 true。如果 price 是 9.90，则返回 false。
     >	        大于          	price>9.80                如果 price 是 9.90，则返回 true。如果 price 是 9.80，则返回 false。
     >=	        大于或等于       	price>=9.80               如果 price 是 9.90，则返回 true。如果 price 是 9.70，则返回 false。
     or     	或	            price=9.80 or price=9.70  如果 price 是 9.80，则返回 true。如果 price 是 9.50，则返回 false。
     and	    与	            price>9.00 and price<9.90 如果 price 是 9.80，则返回 true。如果 price 是 8.50，则返回 false。
     mod	  计算除法的余数   	5 mod 2                     	1
     */


    /**
     * 正则表达式 快速学习笔记
     *
     */


    /**

     +  号代表前面的字符必须至少出现一次（1次或多次）。

     *   号代表字符可以不出现，也可以出现一次或者多次（0次、或1次、或多次）。

     ?  问号代表前面的字符最多只可以出现一次（0次、或1次）。

     非打印字符

     字符	描述
     \cx	匹配由x指明的控制字符。例如， \cM 匹配一个 Control-M 或回车符。x 的值必须为 A-Z 或 a-z 之一。否则，将 c 视为一个原义的 'c' 字符。
     \f	    匹配一个换页符。等价于 \x0c 和 \cL。
     \n 	匹配一个换行符。等价于 \x0a 和 \cJ。
     \r	    匹配一个回车符。等价于 \x0d 和 \cM。
     \s	    匹配任何空白字符，包括空格、制表符、换页符等等。等价于 [ \f\n\r\t\v]。
     \S	    匹配任何非空白字符。等价于 [^ \f\n\r\t\v]。
     \t	    匹配一个制表符。等价于 \x09 和 \cI。
     \v	    匹配一个垂直制表符。等价于 \x0b 和 \cK。

     特殊字符

     特别字符	描述
     $	    匹配输入字符串的结尾位置。如果设置了 RegExp 对象的 Multiline 属性，则 $ 也匹配 '\n' 或 '\r'。要匹配 $ 字符本身，请使用 \$。

     ( )	标记一个子表达式的开始和结束位置。子表达式可以获取供以后使用。要匹配这些字符，请使用 \( 和 \)。

     *	    匹配前面的子表达式零次或多次。要匹配 * 字符，请使用 \*。

     +	    匹配前面的子表达式一次或多次。要匹配 + 字符，请使用 \+。

     .	    匹配除换行符 \n 之外的任何单字符。要匹配 . ，请使用 \. 。

     [	    标记一个中括号表达式的开始。要匹配 [，请使用 \[。

     ?	    匹配前面的子表达式零次或一次，或指明一个非贪婪限定符。要匹配 ? 字符，请使用 \?。

     \	    将下一个字符标记为或特殊字符、或原义字符、或向后引用、或八进制转义符。例如， 'n' 匹配字符 'n'。'\n' 匹配换行符。序列 '\\' 匹配 "\"，而 '\(' 则匹配 "("。

     ^	    匹配输入字符串的开始位置，除非在方括号表达式中使用，此时它表示不接受该字符集合。要匹配 ^ 字符本身，请使用 \^。

     {	    标记限定符表达式的开始。要匹配 {，请使用 \{。

     |	    指明两项之间的一个选择。要匹配 |，请使用 \|。

     */


}
