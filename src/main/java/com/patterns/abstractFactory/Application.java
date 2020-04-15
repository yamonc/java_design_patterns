package com.patterns.abstractFactory;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.logging.Logger;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2020/4/15
 */
public class Application {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Application.class));
    private Ship mShip;
    private Captain mCaption;
    private Sailor mSailor;

    public Ship getmShip() {
        return mShip;
    }

    public void setmShip(Ship mShip) {
        this.mShip = mShip;
    }

    public Captain getmCaption() {
        return mCaption;
    }

    public void setmCaption(Captain mCaption) {
        this.mCaption = mCaption;
    }

    public Sailor getmSailor() {
        return mSailor;
    }

    public void setmSailor(Sailor mSailor) {
        this.mSailor = mSailor;
    }

    public void createTeam(final TeamFactory factory){
        setmCaption(factory.createCaptain());
        setmShip(factory.createShip());
        setmSailor(factory.createSailor());
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createTeam(new YoungTeamFactory());
        LOGGER.info("正在创建一支年轻的队伍");
        LOGGER.info("->"+application.getmCaption().getDescription());
        LOGGER.info("->"+application.getmShip().getDescription());
        LOGGER.info("->"+application.getmSailor().getDescription());



        application.createTeam(new PermanentTeamFactory());
        LOGGER.info("正在创建一支年老的队伍");
        LOGGER.info("->"+application.getmCaption().getDescription());
        LOGGER.info("->"+application.getmShip().getDescription());
        LOGGER.info("->"+application.getmSailor().getDescription());
    }
}
