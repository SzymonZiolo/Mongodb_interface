package Database_mongodb;

import org.bson.types.ObjectId;

/**
 * Created by RENT on 2017-07-26.
 */
public class MongoCar extends Car {

    public MongoCar(String model, String manufacturer, String[] addons, String productionYear, int enginePower) {
        super(model, manufacturer, addons, productionYear, enginePower);
    }

    private ObjectId _id;

}
