package domaci5;

import domaci5.selection.Band.Band;
import domaci5.selection.Band.BandProperties;
import domaci5.selection.price.Price;
import domaci5.selection.priceOverrides.BrandProperties;
import domaci5.selection.priceOverrides.PriceOverrides;
import domaci5.statusOverrides.StatusOverrides;

public class Selection {

    private String id;
    private String participantId;
    private String name;
    private String nameTid;
    private Status status;
    private StatusOverrides statusOverrides;
    private TradeStatus tradeStatus;
    private Price price;
    private PriceOverrides priceOverrides;
    private int side;
    private int line;
    private boolean pushHonored;
    private int placeReduction;
    private int homeScore;
    private int awayScore;
    private Band Band;



}
