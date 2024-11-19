package com.example.foyer.Controllers;

import com.example.foyer.Services.BlocServiceImp;
import com.example.foyer.entities.Bloc;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/blocs")
@Tag(name = "Gestion Bloc", description = "API for managing Blocs")
public class BlocController {



    BlocServiceImp blocService;

    @PostMapping()
    @Operation(summary = "Add a new Bloc", description = "Creates a new Bloc and returns the created object.")
    public Bloc ajoutBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("{idBloc}")
    @Operation(summary = "Get Bloc by ID", description = "Retrieves a Bloc by its ID.")
    public Bloc getBloc(@PathVariable("idBloc") int idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Bloc", description = "Deletes a Bloc based on the provided Bloc object.")
    public void deleteBloc(@RequestBody Bloc bloc) {
        blocService.deleteBloc(bloc);
    }

    @PutMapping()
    @Operation(summary = "Update a Bloc", description = "Updates an existing Bloc and returns the updated object.")
    public Bloc modifierBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping()
    @Operation(summary = "Get all Blocs", description = "Retrieves a list of all Blocs.")
    public List<Bloc> getAllBloc() {
        return blocService.getAllBloc();
    }

    @PostMapping("ajouterBlocEtChambresAssocie")
    @Operation(summary = "ajouter Bloc Et Chambres Associe" , description = "ajouter un bloc avec ses chambres associés")
    public Bloc ajouterBlocEtChambresAssocie(@RequestBody Bloc bloc) {
        return blocService.ajouterBlocEtChambresAssocie(bloc);
    }

    @GetMapping("findBlocByUniversite/{idUniversite}")
    public List<Bloc> getBlocByUniversite(@PathVariable ("idUniversite") int idUniversite) {
        return blocService.getBlocByUniversite(idUniversite);
    }

}