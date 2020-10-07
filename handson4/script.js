const ID = [],
    NAME = [],
    PRICE = [],
    QUANTITY = [];
let i = 0;
let total;

function addPrice() {
    let eventid = document.getElementById("eventId");
    let eventname = document.getElementById("eventName");
    let eventprice = document.getElementById("price");
    let id = document.getElementById("eventIdPara");
    let name = document.getElementById("eventNamePara");
    let price = document.getElementById("pricePara");

    id.innerHTML = "";
    name.innerHTML = "";
    price.innerHTML = "";
    QUANTITY.push(1);
    document.getElementById("tablehead").innerHTML =
        "<tr><th>ID</th><th>Product Name</th><th>Price</th><th>Quantity</th><th>Remove from Cart</th></tr>";
    document.getElementById("tablebody").innerHTML = "";
    ID[i] = document.getElementById("eventId").value;
    NAME[i] = document.getElementById("eventName").value;
    PRICE[i] = document.getElementById("price").value;
    for (let j = 0; j < ID.length; j++) {
        document.getElementById("tablebody").innerHTML +=
            "<tr><td style='text-align:center;'>" +
            ID[j] +
            "</td><td>" +
            NAME[j] +
            "</td><td>" +
            PRICE[j] +
            '</td><td><input onchange="quantity(this.id)" id="select' + j +
            '" type="number" value="' +
            QUANTITY[j] +
            '" min="1"></td><td><a href="#" onclick="remove(this.id)" id="link' +
            j +
            '">Remove</a></td></tr>';
    }
    document.getElementById("eventId").value = "";
    document.getElementById("eventName").value = "";
    document.getElementById("price").value = "";
    document.getElementById("total").value = "";
    total = 0;
    for (let k = 0; k < ID.length; k++) {
        total += parseInt(PRICE[k]) * QUANTITY[k];
    }
    if (total === 0) {
        document.getElementById("total").innerHTML = "";
    } else {
        document.getElementById("total").innerHTML = "The total cost is " + total;
    }
    i++;


}

function remove(id) {
    let rowNumber = parseInt(id.slice(-1));
    ID.splice(rowNumber, 1);
    NAME.splice(rowNumber, 1);
    PRICE.splice(rowNumber, 1);
    QUANTITY.splice(rowNumber, 1);
    if (NAME.length === 0) {
        document.getElementById("tablehead").innerHTML = "";
    } else {
        document.getElementById("tablehead").innerHTML =
            "<tr><th>ID</th><th>Product Name</th><th>Price</th><th>Quantity</th><th>Remove from Cart</th></tr>";
    }
    document.getElementById("tablebody").innerHTML = "";
    for (let j = 0; j < ID.length; j++) {
        document.getElementById("tablebody").innerHTML +=
            "<tr><td style='text-align:center;'>" +
            ID[j] +
            "</td><td>" +
            NAME[j] +
            "</td><td>" +
            PRICE[j] +
            '</td><td><input onchange="quantity(this.id)" id="select' +
            j +
            '" type="number" value="' +
            QUANTITY[j] +
            '" min="1"></td><td><a href="#" onclick="remove(this.id)" id="link' +
            j +
            '">Remove</a></td></tr>';
    }
    document.getElementById("total").value = "";
    total = 0;
    for (let k = 0; k < ID.length; k++) {
        total += parseInt(PRICE[k]) * QUANTITY[k];
    }
    if (total === 0) {
        document.getElementById("total").innerHTML = "";
    } else {
        document.getElementById("total").innerHTML = "The total cost is " + total;
    }
    i--;
}

function quantity(idno) {
    let idNumber = parseInt(idno.slice(-1));
    QUANTITY[idNumber] = document.getElementById(idno).value;
    total = 0;
    for (let k = 0; k < ID.length; k++) {
        total += parseInt(PRICE[k]) * QUANTITY[k];
    }
    if (total === 0) {
        document.getElementById("total").innerHTML = "";
    } else {
        document.getElementById("total").innerHTML = "The total cost is " + total;
    }
}