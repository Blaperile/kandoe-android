package controllers.resources.users;

import be.kdg.kandoe.backend.dom.content.Theme;
import be.kdg.kandoe.backend.dom.user.Organisation;
import be.kdg.kandoe.frontend.controllers.resources.content.ThemeResource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by   Shenno Willaert
 * Date         26/02/2016
 * Project      kandoe
 * Package      be.kdg.kandoe.frontend.controllers.resources.users
 */
public class OrganisationResource implements Serializable {
    private Integer id;
    private String name;
    private List<ThemeResource> themes;
    private UserResource organisator;

    //PUSH

   /* public OrganisationResource(Organisation organisation) {
        this.organisationId = organisation.getId();
        this.organisationName = organisation.getName();
        List<ThemeResource> themeResources = new ArrayList<>();
        for(Theme t : organisation.getThemes()) {
            themeResources.add(new ThemeResource(t));
        }
        this.setThemes(themeResources);
        this.organisator = new UserResource(organisation.getOrganisator());
    }*/

    public OrganisationResource() {
        this.themes = new ArrayList<ThemeResource>();
        this.organisator = new UserResource();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ThemeResource> getThemes() {
        return themes;
    }

    public void setThemes(List<ThemeResource> themes) {
        this.themes = themes;
    }

    public UserResource getOrganisator() {
        return organisator;
    }

    public void setOrganisator(UserResource organisator) {
        this.organisator = organisator;
    }
}
