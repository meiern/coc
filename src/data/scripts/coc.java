package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.StarSystemAPI;

import java.util.List;

public class coc extends BaseModPlugin {
    List<StarSystemAPI> places = Global.getSector().getStarSystems();
}
