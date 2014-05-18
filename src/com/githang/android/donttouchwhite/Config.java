/*
 * @(#)Config.java		       Project:dont-touch-white
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
 * 手机配置
 * @author Geek_Soledad <a target="_blank" href=
 *         "http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=XTAuOSVzPDM5LzI0OR0sLHM_MjA"
 *         style="text-decoration:none;"><img src=
 *         "http://rescdn.qqmail.com/zh_CN/htmledition/images/function/qm_open/ico_mailme_01.png"
 *         /></a>
 */
public class Config {
    
    private int screenWidth;
    private int screenHeight; 

    /**
     * @param screenWidth 手机屏幕的宽度。
     * @param screenHeight 手机屏幕的高度。
     */
    public Config(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public int getTouchX1() {
        return screenWidth >>> 2;
    }

    public int getTouchX2() {
        return (screenWidth* 3) >>> 2 ;
    }

    public int getTouchY() {
        return screenHeight - (screenHeight >>> 3);
    }
    
    public int getConverseY() {
        return screenHeight >>> 2;
    }
}
