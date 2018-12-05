
/*  Dropdown lists */
function myFunction(element) {
    let dropdowns = document.getElementsByClassName("dropdown-content");
    let i;
    for (i = 0; i < dropdowns.length; i++) {
        dropdowns[i].classList.remove('show');
    }
    // element.nextSibling is the carriage return… need to go to the next next to point on the dropdown menu
    element.nextSibling.nextSibling.classList.toggle("show");
}


/* function to close the dropdown when clicked outside. */
window.onclick = function(event) {
    if (!event.target.matches('.dropbtn')) {
        let dropdowns = document.getElementsByClassName("dropdown-content");
        let i;
        for (i = 0; i < dropdowns.length; i++) {
            let openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

// /*  Dropdown lists */
// function myFunction(element) {
//     let dropdowns = document.getElementsByClassName("dropdown-content");
//     let i;
//     for (i = 0; i < dropdowns.length; i++) {
//         dropdowns[i].classList.remove('show');
//     }
//     // element.nextSibling is the carriage returnâ€¦ need to go to the next next to point on the dropdown menu
//     element.nextSibling.nextSibling.classList.toggle("show");
// }
//
//
// /* function to close the dropdown when clicked outside. */
// window.onclick = function(event) {
//     if (!event.target.matches('.dropbtn')) {
//         let dropdowns = document.getElementsByClassName("dropdown-content");
//         let i;
//         for (i = 0; i < dropdowns.length; i++) {
//             let openDropdown = dropdowns[i];
//             if (openDropdown.classList.contains('show')) {
//                 openDropdown.classList.remove('show');
//             }
//         }
//     }
// }