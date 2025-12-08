package com.devcalc;

import io.javalin.Javalin;

public class DevCalcApplication {

    public static void main(String[] args) {

        // Instancia o serviço da calculadora
        CalculatorService service = new CalculatorService();

        // Sobe o servidor Javalin na porta 7000
        Javalin app = Javalin.create(config -> {
            config.http.defaultContentType = "text/plain";
        }).start(7000);

        // Endpoint de soma
        app.get("/add", ctx -> {
            String aParam = ctx.queryParam("a");
            String bParam = ctx.queryParam("b");

            double a = (aParam == null || aParam.isBlank()) ? 0.0 : Double.parseDouble(aParam);
            double b = (bParam == null || bParam.isBlank()) ? 0.0 : Double.parseDouble(bParam);

            ctx.result(String.valueOf(service.add(a, b)));
        });

        // Endpoint de subtração
        app.get("/subtract", ctx -> {
            String aParam = ctx.queryParam("a");
            String bParam = ctx.queryParam("b");

            double a = (aParam == null || aParam.isBlank()) ? 0.0 : Double.parseDouble(aParam);
            double b = (bParam == null || bParam.isBlank()) ? 0.0 : Double.parseDouble(bParam);

            ctx.result(String.valueOf(service.subtract(a, b)));
        });

        // Endpoint de multiplicação
        app.get("/multiply", ctx -> {
            String aParam = ctx.queryParam("a");
            String bParam = ctx.queryParam("b");

            double a = (aParam == null || aParam.isBlank()) ? 0.0 : Double.parseDouble(aParam);
            double b = (bParam == null || bParam.isBlank()) ? 0.0 : Double.parseDouble(bParam);

            ctx.result(String.valueOf(service.multiply(a, b)));
        });

        // Endpoint de divisão
        app.get("/divide", ctx -> {
            String aParam = ctx.queryParam("a");
            String bParam = ctx.queryParam("b");

            double a = (aParam == null || aParam.isBlank()) ? 0.0 : Double.parseDouble(aParam);
            double b = (bParam == null || bParam.isBlank()) ? 1.0 : Double.parseDouble(bParam);

            ctx.result(String.valueOf(service.divide(a, b)));
        });
    }
}
