/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcore.client.color;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class ColorSet {

    @JsProperty
    public Color baseColor;

    @JsProperty
    public Color[] list;

    @JsProperty
    public Number maxLightness;

    @JsProperty
    public Number minColors;

    @JsProperty
    public Number minLightness;

    @JsProperty
    public boolean reuse;

    @JsProperty
    public Number saturation;

    @JsProperty
    public boolean shuffle;

    @JsProperty
    public int step;

    @JsProperty
    public ColorSetStepOptions stepOptions;

    @JsProperty
    public boolean wrap;

    @JsMethod
    public native Color next();

    @JsMethod
    public native void reset();

    @JsMethod
    public native Color getIndex(int index);

    @JsMethod
    public native void generate(int count);
}
