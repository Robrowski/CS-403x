package edu.cs430x.fuschia.geosnap.network.imgur.model;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.mime.TypedFile;

/**
 * Created by AKiniyalocts on 2/23/15. https://github.com/AKiniyalocts/imgur-android
 *
 * This is our imgur API. It generates a rest API via Retrofit from Square inc.
 *
 * more here: http://square.github.io/retrofit/
 */
public interface ImgurAPI {
  public static String server = "https://api.imgur.com";


  /****************************************
   * Upload
   * Image upload API
   */

  /**
   *
   * @param auth #Type of authorization for upload
   * @param title #Title of image
   * @param description #Description of image
   * @param albumId #ID for album (if the user is adding this image to an album)
   * @return
   */
  @POST("/3/image") ImageResponse postImage (
          @Header("Authorization") String auth,
          @Query("title") String title,
          @Query("description") String description,
          @Query("album") String albumId,
          @Query("account_url") String username,
          @Body TypedFile file
  );

  @GET("/3/image") ImageResponse getImage (
          @Header("Authorization") String auth,
          @Path("id") String id
  );


}
