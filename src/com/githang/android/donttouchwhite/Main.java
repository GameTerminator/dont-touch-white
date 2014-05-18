/*
 * @(#)Main.java	       Project:lianmeng
 * Date-Time:2013-10-17 下午12:40:34
 *
 * Copyright (c) 2013 CFuture09, Institute of Software, 
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

import java.io.IOException;

import com.android.chimpchat.adb.AdbBackend;
import com.android.chimpchat.core.IChimpDevice;
import com.android.chimpchat.core.TouchPressType;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        AdbBackend adbBack = new AdbBackend();
        IChimpDevice mChimpDevice = adbBack.waitForConnection();
        long time = System.currentTimeMillis();
//        while (System.currentTimeMillis() - time < 2260) {
        while(true){
            mChimpDevice.touch(180, 1000, TouchPressType.DOWN_AND_UP);
            mChimpDevice.touch(540, 1000, TouchPressType.DOWN_AND_UP);
        }
    }

}
