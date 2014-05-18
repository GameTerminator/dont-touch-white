/*
 * @(#)Mode.java		       Project:dont-touch-white
 * Date:2014-5-18
 *
 * Copyright (c) 2014 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.githang.android.donttouchwhite;

/**
 * 这是建议的每个模式玩的时间。这是在我的华为3C手机下测的时间，不同手机下会有不同，同一手机下也有差别。
 * 增加这个时间是为了减少通关之后还一直发送触摸手机的事件。这里设的时间都是比我在手机上玩通关的时间略大。
 * @author Geek_Soledad <a target="_blank" href=
 *         "http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=XTAuOSVzPDM5LzI0OR0sLHM_MjA"
 *         style="text-decoration:none;"><img src=
 *         "http://rescdn.qqmail.com/zh_CN/htmledition/images/function/qm_open/ico_mailme_01.png"
 *         /></a>
 */
public interface Mode {

    int MAX = Integer.MAX_VALUE;
    long MAX_MAX = Long.MAX_VALUE;
    
    int CLASSIC_25 = 2200;
    int CLASSIC_50 = 3800;
    int CLASSIC_DISCONTINUE = 3900;
    
    int CHAN_15 = 15000;
    int CHAN_30 = 30000;
    int CHAN_DISCONTINUE = 30000;
    
}
