package testRetroFit;


import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by Shenno on 12/04/2015.
 */
public interface JppService {



    @GET("apps/partials_html/detailOrganisation.component.html")
    void getOrganisation();

   /* @GET("/api/Account/getInfo/{email}/")
    void getUserInfo(@Path("email") String email, Callback<DtoUserInfo> callback);

    @FormUrlEncoded
    @POST("/token")
    void getToken(@Field("grant_type") String grantType, @Field("username") String username, @Field("password") String password, Callback<Token> created);

    @GET("/api/dms/open/{dmId}")
    void getOpenDms(@Path("dmId") int dmId, Callback<List<DtoDms>> callback);

    @GET("/api/dms/{dmsId}")
    void getDms(@Path("dmsId") int dmsId, Callback<DtoDmsDetailed> callback);

    @GET("/api/dms/{dmsId}/dossiers")
    void getDossiers(@Path("dmsId") int dmsId, Callback<List<DtoDossier>> callBack);

    @GET("/api/dms/dossier/{dId}")
    void getDossier(@Path("dId") int dId, Callback<DtoDossierDetailed> callback);

    @POST("/api/dms/dossier")
    void postDossier(@Header("Authorization") String token, @Body DtoDossierPost dtoDossierPost, Callback<DtoDossierPost> callback);

    @POST("/api/dms/dossier/extra")
    void addExtraToDossier(@Header("Authorization") String token, @Body DtoAddExtra dtoAddExtra, Callback<DtoAddExtra> callback);

    @POST("/api/dms/dossier/location")
    void addLocationToDossier(@Header("Authorization") String token, @Body DtoAddLocation dtoAddLocation, Callback<DtoAddLocation> callback);

    @POST("/api/dms/dossier/event")
    void addEventToDossier(@Header("Authorization") String token, @Body DtoAddEvent dtoAddEvent, Callback<DtoAddEvent> callback);

    @GET("/api/ams/open/{asmId}")
    void getOpenAms(@Path("asmId") int asmId, Callback<List<DtoAsm>> callBack);

    @GET("/api/ams/{amsId}")
    void getAms(@Path("amsId") int amsId, Callback<DtoAmsDetailed> callBack);

    @GET("/api/ams/{amsId}/reactions")
    void getReactions(@Path("amsId") int amsId, Callback<List<DtoReaction>> callBack);

    @GET("/api/ams/reactions/{rId}")
    void getReaction(@Path("rId") int rId, Callback<DtoReactionDetailed> callBack);

    @GET("/api/ams/reaction/{email}/")
    void getReactionsByEmail(@Header("Authorization") String token, @Path("email") String email, Callback<List<DtoReaction>> callBack);

    @GET("/api/dms/dossiers/{email}/")
    void getDossiersByEmail(@Header("Authorization") String token, @Path("email") String email, Callback<List<DtoDossier>> callBack);

    @POST("/api/dms/dossier/vote")
    void addVote(@Header("Authorization") String token, @Body DtoVote dtoVote, Callback<DtoVote> callback);

    @POST("/api/ams/reaction/vote")
    void addVoteR(@Header("Authorization") String token, @Body DtoVote dtoVote, Callback<DtoVote> callback);

    @POST("/api/ams/reaction")
    void postReaction(@Header("Authorization") String token, @Body DtoReactionPost dtoReactionPost, Callback<DtoReactionPost> callback);




    */




}
