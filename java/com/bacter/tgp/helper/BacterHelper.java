package com.bacter.tgp.helper;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bacter.tgp.R;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class BacterHelper implements View.OnClickListener
{
    private final Activity activity;

    private BacterHelper(Activity activity)
    {
        this.activity = activity;
    }
    public static BacterHelper with(Activity activity)
    {
        return new BacterHelper(activity);
    }
    public void loadAbout()
    {
        final FrameLayout ahukLayout = activity.findViewById(R.id.about);
        AboutBuilder ahukBuilder = AboutBuilder.with(activity)
                .setAppIcon(R.mipmap.ic_launcher_round)
                .setAppName(R.string.app_name)
                .setPhoto(R.drawable.dev)
                .setCover(R.drawable.liveandletlive)
                .setLinksAnimated(true)
                .setDividerDashGap(13)
                .setDividerColor(R.color.colorAccent)
                .setName("BdFreak")
                .setNameColor(R.color.colorAccent)
                .setSubTitle("App Developer")
                .setLinksColumnsCount(3)
                .setBrief("Ideas Maker, Curious and Ahuk Lover\nBuild with ❤")
                .addGitHubLink("Bacter777")
                .addFacebookLink("BdFreak777")
                .addEmailLink("bdfreak777@gmail.com")
                .addFiveStarsAction()
                .addMoreFromMeAction("bdfreak")
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setActionsColumnsCount(2)
                .addFeedbackAction("bdfreak777@gmail.com")
                .addIntroduceAction((Intent)null)
                .addHelpAction((Intent)null)
                .addChangeLogAction((Intent)null)
                .addRemoveAdsAction((Intent)null)
                .addDonateAction((Intent)null)
                .setWrapScrollView(true)
                .setShowAsCard(true);
        AboutView view = ahukBuilder.build();
        ahukLayout.addView(view);
    }

    @Override
    public void onClick(View v) {

    }
}
