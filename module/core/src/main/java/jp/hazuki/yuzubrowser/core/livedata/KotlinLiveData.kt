/*
 * Copyright (C) 2017-2021 Hazuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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

package jp.hazuki.yuzubrowser.core.livedata

import androidx.lifecycle.MutableLiveData

class KotlinLiveData<T>(default: T) : MutableLiveData<T>() {

    init {
        value = default
    }

    override fun getValue(): T {
        return super.getValue()!!
    }

    operator fun timesAssign(value: T) {
        this.value = value
    }
}
