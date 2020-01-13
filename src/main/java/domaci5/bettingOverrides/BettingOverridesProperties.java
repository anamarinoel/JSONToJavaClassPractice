package domaci5.bettingOverrides;

import domaci5.betting.BettingProperties;
import domaci5.selection.Band.BandProperties;

import java.sql.Time;

public class BettingOverridesProperties {

    private BettingProperties original;
    private BandProperties override;
    private int overrideType;
    private String who;
    private Time when;

}
