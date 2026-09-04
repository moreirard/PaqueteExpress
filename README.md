# 📦 PaqueteExpress

## Sistema de Procesamiento de Pedidos de Envío

*Ejercicio de clase — a resolver con TDD (baby steps) y tests en formato Given-When-Then*

---

Una empresa de logística nos pide modelar el núcleo de su sistema de procesamiento de pedidos: el cálculo del costo de envío y el proceso de despacho de cada pedido hasta que queda listo para salir del depósito.

## 1. Pedidos

Cada pedido tiene definido:

- un peso, expresado en kilogramos;
- un tipo de envío elegido por el cliente al momento de la compra.

## 2. Tipos de envío y cálculo del costo

El costo de envío depende del tipo elegido:

- **Envío Estándar**: cuesta $150 de base más $30 por cada kilogramo.
- **Envío Expres**: cuesta $400 de base más $60 por cada kilogramo.
- **Retiro en sucursal**: no tiene costo, cualquiera sea el peso del pedido.

ℹ️ La empresa planea incorporar nuevos tipos de envío en el futuro (por ejemplo, un envío aéreo para cargas especiales). El diseño debe permitir agregarlos sin modificar el código ya existente.

## 3. Despacho de pedidos

Todo pedido, sin importar su alcance geográfico, se despacha siguiendo siempre la misma secuencia de pasos:

1. Calcular el costo de envío, según el tipo de envío elegido.
2. Generar el número de guía de seguimiento.
3. Confirmar el despacho.

💡 El diseño debe reflejar que esta secuencia de pasos es siempre la misma para cualquier pedido, aunque el paso de generación de la guía —y, en algunos casos, algún paso adicional— cambie según el tipo de pedido.

## 4. Tipos de pedido

- **Pedido Nacional**: el número de guía tiene el formato «PED-NAC-\<n\>». No paga impuestos aduaneros.
- **Pedido Internacional**: el número de guía tiene el formato «PED-INT-\<n\>». Además, antes de confirmar el despacho, se le debe calcular y sumar un impuesto aduanero equivalente al 15% del costo de envío.

ℹ️ Podrían agregarse en el futuro nuevos tipos de pedido (por ejemplo, un Pedido Express dentro del propio país). El diseño debe anticiparlo.

## 5. Restricciones de diseño

- No se permite usar estructuras condicionales (if/switch) para decidir el costo de envío según el tipo elegido.
- El proceso de despacho tiene una secuencia fija de pasos, en ese orden. El diseño debe impedir que una subclase de pedido la altere.
- El sistema debe quedar preparado para incorporar nuevos tipos de envío y nuevos tipos de pedido sin modificar código existente.
- Las responsabilidades deben estar correctamente distribuidas entre los objetos del sistema.

---

📝 *Trabajaremos este ejercicio en clase con TDD: un test por vez, en formato Given-When-Then, agregando primero los casos más simples. A medida que el código crezca, prestá atención a las señales que puedan sugerir una refactorización.*
