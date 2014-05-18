dont-touch-white
================

《别踩白块儿》是某个团队开发的一个手机游戏，简单而又比较好玩。作为一个懒惰的程序员，由于实在是懒得用手去玩，于是决定写个程序用电脑来帮我刷记录。

代码很简单，实际上核心的代码只是这4句：

    while (true) {
            mChimpDevice.touch(x1, y, TouchPressType.DOWN_AND_UP);
            mChimpDevice.touch(x2, y, TouchPressType.DOWN_AND_UP);
    }

本程序仅用于学习研究，和在熟悉的朋友之间做小小炫耀。如果是要刷进排行榜的记录，网上自有烧饼之类的工具。而比之用游戏修改器，自己动手写个程序来实现，这个过程或许才是程序员的乐趣所在。