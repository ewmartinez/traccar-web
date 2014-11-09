package org.traccar.web.shared.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="application_settings")
public class ApplicationSettings implements Serializable {

    private static final long serialVersionUID = 1;
    public static final short DEFAULT_UPDATE_INTERVAL = 15000;

    @Id
    @GeneratedValue
    private long id;

    public ApplicationSettings() {
        registrationEnabled = true;
        updateInterval = Short.valueOf(DEFAULT_UPDATE_INTERVAL);
    }

    @Expose
    private boolean registrationEnabled;

    @Expose
    private Short updateInterval;

    @Expose
    @Column(nullable = true)
    private boolean disallowDeviceManagementByUsers;

    public void setRegistrationEnabled(boolean registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
    }

    public boolean getRegistrationEnabled() {
        return registrationEnabled;
    }

    public Short getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Short updateInterval) {
        this.updateInterval = updateInterval;
    }

    public boolean isDisallowDeviceManagementByUsers() {
        return disallowDeviceManagementByUsers;
    }

    public void setDisallowDeviceManagementByUsers(boolean disallowDeviceManagementByUsers) {
        this.disallowDeviceManagementByUsers = disallowDeviceManagementByUsers;
    }
}
