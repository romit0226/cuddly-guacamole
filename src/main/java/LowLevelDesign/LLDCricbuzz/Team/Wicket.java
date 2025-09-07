package LowLevelDesign.LLDCricbuzz.Team;

import com.conceptandcoding.LowLevelDesign.LLDCricbuzz.Inning.BallDetails;
import com.conceptandcoding.LowLevelDesign.LLDCricbuzz.Inning.OverDetails;
import com.conceptandcoding.LowLevelDesign.LLDCricbuzz.Team.Player.PlayerDetails;
import com.conceptandcoding.LowLevelDesign.LLDCricbuzz.Team.WicketType;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail){

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
