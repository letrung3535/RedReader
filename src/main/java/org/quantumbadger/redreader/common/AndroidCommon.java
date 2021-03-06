/*******************************************************************************
 * This file is part of RedReader.
 *
 * RedReader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RedReader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RedReader.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package org.quantumbadger.redreader.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

public class AndroidCommon {
	public static final Handler UI_THREAD_HANDLER = new Handler(Looper.getMainLooper());

	public static void runOnUiThread(@NonNull final Runnable runnable) {

		if(General.isThisUIThread()) {
			runnable.run();
		} else {
			UI_THREAD_HANDLER.post(runnable);
		}
	}
}
