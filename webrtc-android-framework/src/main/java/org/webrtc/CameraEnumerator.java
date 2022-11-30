/*
 *  Copyright 2016 The WebRTC project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a BSD-style license
 *  that can be found in the LICENSE file in the root of the source
 *  tree. An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */

package org.webrtc;

import org.webrtc.CameraEnumerationAndroid.CaptureFormat;

import java.util.List;

public interface CameraEnumerator {
    String[] getDeviceNames();

    boolean isFrontFacing(String deviceName);

    boolean isBackFacing(String deviceName);

    List<CaptureFormat> getSupportedFormats(String deviceName);

    CameraVideoCapturer createCapturer(
            String deviceName, CameraVideoCapturer.CameraEventsHandler eventsHandler);
}
