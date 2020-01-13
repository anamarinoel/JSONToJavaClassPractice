package domaci5;

import domaci5.betting.Betting;
import domaci5.bettingOverrides.BettingOverrides;
import domaci5.result.Result;
import domaci5.statusOverrides.StatusOverrides;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class Market {

    private String id;
    private int version;
    private String sportId;
    private String eventId;
    private String name;
    private String nameTid;
    HashMap<Status, String> status;
    StatusOverrides statusOverrides;
    HashMap<Status, String> tradeStatus;
    private Object tradeStatusOverrides;
    MarketType marketType;
    Taxonomy taxonomy;
    ArrayList<Selection> selections = new ArrayList<Selection>();
    Betting betting;
    BettingOverrides bettingOverrides;
    private int betDelay;
    private boolean hasBetDelay;
    private String availableBetTypes;
    private ResultedTime resultedTime;
    private Result result;
    private String betVoidPeriods;
    private Time createdAt;
}
