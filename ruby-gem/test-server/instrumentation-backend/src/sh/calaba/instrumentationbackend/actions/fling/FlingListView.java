package sh.calaba.instrumentationbackend.actions.fling;

import com.jayway.android.robotium.solo.Solo;

import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;
import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.TestHelpers;

import android.view.Display;
import android.view.View;


public class FlingListView implements Action {

	@Override
	public Result execute(String... args) {

        final View view = TestHelpers.getTextViewByDescription(args[0]);

        if(view == null) {
            return new Result(false, "Could not find view with id: '" + args[0] + "'");
        }
        InstrumentationBackend.solo.scrollViewToSide(view, Solo.LEFT);
        //InstrumentationBackend.solo.
        return Result.successResult();
    
	}

	@Override
	public String key() {
		return "fling_left";
	}

}
