package co.gov.inci.evaluon.backend.models.proxies;

import android.content.Context;

import co.gov.inci.evaluon.backend.models.apisets.Authentication;
import co.gov.inci.evaluon.backend.models.classes.authentication.Token;
import co.gov.inci.evaluon.backend.models.proxies.definers.ApiProxy;
import retrofit.Callback;

/**
 * @author Pablo Andrés Dorado Suárez <pandres95@boolinc.co>
 */
public class AuthenticationProxy extends ApiProxy<Authentication> {

    public AuthenticationProxy(Context context){
        super(context, Authentication.class, false);
    }

    public void password(String username, String password, Callback<Token> callback){
        api.password("password", clientId, clientSecret, username, password, callback);
    }

    public void clientCredentials(Callback<Token> callback){
        api.clientCredentials("client_credentials", clientId, clientSecret, callback);
    }

}
