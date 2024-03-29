/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.swagger.client.model.ErrorRes;
import io.swagger.client.model.RequestInfo;
import io.swagger.client.model.ResponseInfo;
import io.swagger.client.model.SewerageConnectionRequest;
import io.swagger.client.model.SewerageConnectionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SewerageApi {
    private ApiClient apiClient;

    public SewerageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SewerageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for swcCancelPost
     * @param body Request header for the property delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The properrtyId to be deactivated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swcCancelPostCall(RequestInfo body, String tenantId, String connectionNo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/swc/_cancel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        if (connectionNo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("connectionNo", connectionNo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swcCancelPostValidateBeforeCall(RequestInfo body, String tenantId, String connectionNo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling swcCancelPost(Async)");
        }
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling swcCancelPost(Async)");
        }
        // verify the required parameter 'connectionNo' is set
        if (connectionNo == null) {
            throw new ApiException("Missing the required parameter 'connectionNo' when calling swcCancelPost(Async)");
        }
        
        com.squareup.okhttp.Call call = swcCancelPostCall(body, tenantId, connectionNo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deactivate existing water connection.
     * Deactivate existing water connection.
     * @param body Request header for the property delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The properrtyId to be deactivated (required)
     * @return ResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseInfo swcCancelPost(RequestInfo body, String tenantId, String connectionNo) throws ApiException {
        ApiResponse<ResponseInfo> resp = swcCancelPostWithHttpInfo(body, tenantId, connectionNo);
        return resp.getData();
    }

    /**
     * Deactivate existing water connection.
     * Deactivate existing water connection.
     * @param body Request header for the property delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The properrtyId to be deactivated (required)
     * @return ApiResponse&lt;ResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseInfo> swcCancelPostWithHttpInfo(RequestInfo body, String tenantId, String connectionNo) throws ApiException {
        com.squareup.okhttp.Call call = swcCancelPostValidateBeforeCall(body, tenantId, connectionNo, null, null);
        Type localVarReturnType = new TypeToken<ResponseInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deactivate existing water connection. (asynchronously)
     * Deactivate existing water connection.
     * @param body Request header for the property delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The properrtyId to be deactivated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swcCancelPostAsync(RequestInfo body, String tenantId, String connectionNo, final ApiCallback<ResponseInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swcCancelPostValidateBeforeCall(body, tenantId, connectionNo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for swcCreatePost
     * @param body Details for the new Sewerage Connection + RequestHeader meta data. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swcCreatePostCall(SewerageConnectionRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/swc/_create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swcCreatePostValidateBeforeCall(SewerageConnectionRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling swcCreatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = swcCreatePostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Apply for new Sewerage connection.
     * Citizen or employee can apply for new Sewerage connection. 
     * @param body Details for the new Sewerage Connection + RequestHeader meta data. (required)
     * @return SewerageConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SewerageConnectionResponse swcCreatePost(SewerageConnectionRequest body) throws ApiException {
        ApiResponse<SewerageConnectionResponse> resp = swcCreatePostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Apply for new Sewerage connection.
     * Citizen or employee can apply for new Sewerage connection. 
     * @param body Details for the new Sewerage Connection + RequestHeader meta data. (required)
     * @return ApiResponse&lt;SewerageConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SewerageConnectionResponse> swcCreatePostWithHttpInfo(SewerageConnectionRequest body) throws ApiException {
        com.squareup.okhttp.Call call = swcCreatePostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Apply for new Sewerage connection. (asynchronously)
     * Citizen or employee can apply for new Sewerage connection. 
     * @param body Details for the new Sewerage Connection + RequestHeader meta data. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swcCreatePostAsync(SewerageConnectionRequest body, final ApiCallback<SewerageConnectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swcCreatePostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for swcDeletePost
     * @param body Request header for the connection delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The connection no to be deactivated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swcDeletePostCall(RequestInfo body, String tenantId, String connectionNo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/swc/_delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        if (connectionNo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("connectionNo", connectionNo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swcDeletePostValidateBeforeCall(RequestInfo body, String tenantId, String connectionNo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling swcDeletePost(Async)");
        }
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling swcDeletePost(Async)");
        }
        // verify the required parameter 'connectionNo' is set
        if (connectionNo == null) {
            throw new ApiException("Missing the required parameter 'connectionNo' when calling swcDeletePost(Async)");
        }
        
        com.squareup.okhttp.Call call = swcDeletePostCall(body, tenantId, connectionNo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete existing Sewerage connection.
     * Delete existing Sewerage connection.
     * @param body Request header for the connection delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The connection no to be deactivated (required)
     * @return ResponseInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseInfo swcDeletePost(RequestInfo body, String tenantId, String connectionNo) throws ApiException {
        ApiResponse<ResponseInfo> resp = swcDeletePostWithHttpInfo(body, tenantId, connectionNo);
        return resp.getData();
    }

    /**
     * Delete existing Sewerage connection.
     * Delete existing Sewerage connection.
     * @param body Request header for the connection delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The connection no to be deactivated (required)
     * @return ApiResponse&lt;ResponseInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseInfo> swcDeletePostWithHttpInfo(RequestInfo body, String tenantId, String connectionNo) throws ApiException {
        com.squareup.okhttp.Call call = swcDeletePostValidateBeforeCall(body, tenantId, connectionNo, null, null);
        Type localVarReturnType = new TypeToken<ResponseInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete existing Sewerage connection. (asynchronously)
     * Delete existing Sewerage connection.
     * @param body Request header for the connection delete Request. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param connectionNo The connection no to be deactivated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swcDeletePostAsync(RequestInfo body, String tenantId, String connectionNo, final ApiCallback<ResponseInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swcDeletePostValidateBeforeCall(body, tenantId, connectionNo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for swcSearchPost
     * @param body RequestHeader meta data. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param ids List of system generated ids of Sewerage connection. (optional)
     * @param connectionNo List of Sewerage connection numbers to search.. (optional)
     * @param oldConnectionNo List of old Sewerage connection numbers to search.. (optional)
     * @param mobileNumber MobileNumber of owner whose Sewerage connection is to be searched. (optional)
     * @param fromDate Fetches Sewerage Connection with created time after fromDate. (optional)
     * @param toDate Fetches Sewerage Connection with created time till toDate. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swcSearchPostCall(RequestInfo body, String tenantId, List<String> ids, List<String> connectionNo, List<String> oldConnectionNo, Long mobileNumber, BigDecimal fromDate, BigDecimal toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/swc/_search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tenantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tenantId", tenantId));
        if (ids != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));
        if (connectionNo != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "connectionNo", connectionNo));
        if (oldConnectionNo != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "oldConnectionNo", oldConnectionNo));
        if (mobileNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mobileNumber", mobileNumber));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swcSearchPostValidateBeforeCall(RequestInfo body, String tenantId, List<String> ids, List<String> connectionNo, List<String> oldConnectionNo, Long mobileNumber, BigDecimal fromDate, BigDecimal toDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling swcSearchPost(Async)");
        }
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling swcSearchPost(Async)");
        }
        
        com.squareup.okhttp.Call call = swcSearchPostCall(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the list of exsting Sewerage connections.
     * Get the water connections list based on the input parameters. 
     * @param body RequestHeader meta data. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param ids List of system generated ids of Sewerage connection. (optional)
     * @param connectionNo List of Sewerage connection numbers to search.. (optional)
     * @param oldConnectionNo List of old Sewerage connection numbers to search.. (optional)
     * @param mobileNumber MobileNumber of owner whose Sewerage connection is to be searched. (optional)
     * @param fromDate Fetches Sewerage Connection with created time after fromDate. (optional)
     * @param toDate Fetches Sewerage Connection with created time till toDate. (optional)
     * @return SewerageConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SewerageConnectionResponse swcSearchPost(RequestInfo body, String tenantId, List<String> ids, List<String> connectionNo, List<String> oldConnectionNo, Long mobileNumber, BigDecimal fromDate, BigDecimal toDate) throws ApiException {
        ApiResponse<SewerageConnectionResponse> resp = swcSearchPostWithHttpInfo(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate);
        return resp.getData();
    }

    /**
     * Get the list of exsting Sewerage connections.
     * Get the water connections list based on the input parameters. 
     * @param body RequestHeader meta data. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param ids List of system generated ids of Sewerage connection. (optional)
     * @param connectionNo List of Sewerage connection numbers to search.. (optional)
     * @param oldConnectionNo List of old Sewerage connection numbers to search.. (optional)
     * @param mobileNumber MobileNumber of owner whose Sewerage connection is to be searched. (optional)
     * @param fromDate Fetches Sewerage Connection with created time after fromDate. (optional)
     * @param toDate Fetches Sewerage Connection with created time till toDate. (optional)
     * @return ApiResponse&lt;SewerageConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SewerageConnectionResponse> swcSearchPostWithHttpInfo(RequestInfo body, String tenantId, List<String> ids, List<String> connectionNo, List<String> oldConnectionNo, Long mobileNumber, BigDecimal fromDate, BigDecimal toDate) throws ApiException {
        com.squareup.okhttp.Call call = swcSearchPostValidateBeforeCall(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate, null, null);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of exsting Sewerage connections. (asynchronously)
     * Get the water connections list based on the input parameters. 
     * @param body RequestHeader meta data. (required)
     * @param tenantId Unique id for a tenant. (required)
     * @param ids List of system generated ids of Sewerage connection. (optional)
     * @param connectionNo List of Sewerage connection numbers to search.. (optional)
     * @param oldConnectionNo List of old Sewerage connection numbers to search.. (optional)
     * @param mobileNumber MobileNumber of owner whose Sewerage connection is to be searched. (optional)
     * @param fromDate Fetches Sewerage Connection with created time after fromDate. (optional)
     * @param toDate Fetches Sewerage Connection with created time till toDate. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swcSearchPostAsync(RequestInfo body, String tenantId, List<String> ids, List<String> connectionNo, List<String> oldConnectionNo, Long mobileNumber, BigDecimal fromDate, BigDecimal toDate, final ApiCallback<SewerageConnectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swcSearchPostValidateBeforeCall(body, tenantId, ids, connectionNo, oldConnectionNo, mobileNumber, fromDate, toDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for swcUpdatePost
     * @param body Request of Sewerage connection details. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call swcUpdatePostCall(SewerageConnectionRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/swc/_update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call swcUpdatePostValidateBeforeCall(SewerageConnectionRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling swcUpdatePost(Async)");
        }
        
        com.squareup.okhttp.Call call = swcUpdatePostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update existing Sewerage connection details.
     * Updates a given &#x60;Sewerage connection&#x60; with newer details.
     * @param body Request of Sewerage connection details. (required)
     * @return SewerageConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SewerageConnectionResponse swcUpdatePost(SewerageConnectionRequest body) throws ApiException {
        ApiResponse<SewerageConnectionResponse> resp = swcUpdatePostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Update existing Sewerage connection details.
     * Updates a given &#x60;Sewerage connection&#x60; with newer details.
     * @param body Request of Sewerage connection details. (required)
     * @return ApiResponse&lt;SewerageConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SewerageConnectionResponse> swcUpdatePostWithHttpInfo(SewerageConnectionRequest body) throws ApiException {
        com.squareup.okhttp.Call call = swcUpdatePostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update existing Sewerage connection details. (asynchronously)
     * Updates a given &#x60;Sewerage connection&#x60; with newer details.
     * @param body Request of Sewerage connection details. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call swcUpdatePostAsync(SewerageConnectionRequest body, final ApiCallback<SewerageConnectionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = swcUpdatePostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SewerageConnectionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
