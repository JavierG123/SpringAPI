/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.User;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T00:47:38.876974+01:00[Europe/Madrid]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /users : Obtener todos los usuarios
     *
     * @return Lista de usuarios (status code 200)
     */
    @Operation(
        operationId = "usersGet",
        summary = "Obtener todos los usuarios",
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de usuarios", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<User>> usersGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{id} : Obtener un usuario por ID
     *
     * @param id  (required)
     * @return Usuario encontrado (status code 200)
     *         or Usuario no encontrado (status code 404)
     */
    @Operation(
        operationId = "usersIdGet",
        summary = "Obtener un usuario por ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "Usuario encontrado", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<User> usersIdGet(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /users : Crear un nuevo usuario
     *
     * @param user  (required)
     * @return Usuario creado (status code 201)
     */
    @Operation(
        operationId = "usersPost",
        summary = "Crear un nuevo usuario",
        responses = {
            @ApiResponse(responseCode = "201", description = "Usuario creado")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> usersPost(
        @Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
