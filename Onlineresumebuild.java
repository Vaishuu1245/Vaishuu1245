function addNewWeField(){
    // console.log("Adding New Field");

    let newNode= document.createElement('textarea');
    newNode.classList.add('form-control');
    newNode.classList.add('weField');
    newNode.classList.add('mt-2');
    newNode.setAttribute("rows",3);
    newNode.setAttribute("placeholder","Enter Here");



    let weOb =document.getElementById("we");
    let weAddButtonOb = document.getElementById("weAddButton");

    weOb.insertBefore(newNode , weAddButtonOb);

}
 

// Generate CV function

function GenerateCV(){
    // console.log("Generate CV")
    let nameField= document.getElementById("nameField").value;

    let nameT1= document.getElementById('nameT1')

    nameT1.innerHTML =nameField;

    // Direct
    document.getElementById('nameT2').innerHTML = nameField;


    document.getElementById('contactT').innerHTML = document.getElementById("contactField").value;

    document.getElementById('addressT').innerHTML = document.getElementById("addressField").value;

    document.getElementById('fbT').innerHTML = document.getElementById("fbField").value;

    document.getElementById('instaT').innerHTML = document.getElementById("instaField").value;

    document.getElementById('linkedT').innerHTML = document.getElementById("linkedField").value;
    
    
    // Objective
    
    document.getElementById('objectiveT').innerHTML = document.getElementById("objectiveField").value;


    // Work Experience

    let wes = document.getElementsByClassName('weField')

    let str= ''

    for(let e of wes){
        str = str + `<li> ${e.value}</li>`;
    }

    document.getElementById('weT').innerHTML = str;


    //  Academic Qualification

    document.getElementById('aqT').innerHTML = document.getElementById("aqField").value;


    document.getElementById('cv-form').style.display='none';
    document.getElementById('cv-template').style.display='block';

}



//  Print CV Function

function PrintCV(){
    window.print();
      }
