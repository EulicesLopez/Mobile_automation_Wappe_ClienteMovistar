package com.tsoft.bot.frontend.steps.MiMovistar;

import com.tsoft.bot.frontend.pageobject.MiMovistar.HomePageObject;
import com.tsoft.bot.frontend.pageobject.MiMovistar.LoginPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends LoginPageObject {

HomePageObject homePageObject= new HomePageObject();
    @Given("^Usuario ingresa a la App Mi Movistar$")
    public void usuarioIngresaALaAppMiMovistar() throws Exception {
       bienvenidaMovistarEmpresas();
    }


    @When("^Usuario Ingresa credenciales de usuario \"([^\"]*)\"$")
    public void usuarioIngresaCredencialesDeUsuario(String casoPrueba) throws Throwable {
        ingresoCredencialesUsurioDocumento(casoPrueba);
    }

    @Then("^se da clic en el botón ingresar y se verifica acceso$")
    public void seDaClicEnElBotónIngresarYSeVerificaAcceso() throws Throwable {
        seleccionarUnaEmpresa();
        getNombreClienteyRol();

        homePageObject.seleccionarMenuProductos();
        homePageObject.seleccionarMenuSolitudes();
        homePageObject.seleccionarMenuFacturacion();
        homePageObject.seleccionarMenuCasitaHome();
        homePageObject.seleccionarMenuCompras();

        cerrarSesion();

    }
}
