function editTicket(){
    var row  = getSelectedRow();
    var hiddenInput = $(row).find('input[type="hidden"]');
    var id = $(hiddenInput).val();
    alert(id);
};

function deleteTicket(){
    var row  = getSelectedRow();
    var hiddenInput = $(row).find('input[type="hidden"]');
    var id = $(hiddenInput).val();
    alert(id);
};

function getSelectedRow(){
    var table = $("#tickets");
    if (!isNullOrUndefine(table) && table.length > 0) {
        var rows = table[0].rows;
        for (var i = 0; i < rows.length; i++) {
            if (isRowSelected(rows[i])){
                return rows[i];
            }
        }
    }
}

$(document).ready(function(){
    $("#tickets tr").click(function(event) {
        var table = $("#tickets");
        var row = event.target.parentElement;
        var selectedRow = getSelectedRow();
        if (!isNullOrUndefine(selectedRow) && row == selectedRow){
            selectRow(row);
            return;
        }
        unSelectRows(table);
        selectRow(row);
    });
});

function unSelectRows(table){
    if (!isNullOrUndefine(table) && table.length > 0)
    {
        var rows = table[0].rows;
        for (var i = 0; i < rows.length; i++) {
            if (isRowSelected(rows[i])){
                selectRow(rows[i]);
            }
        }
    }
};

function selectRow(row){
    if (isRowSelected(row)){
        $(row).css('background-color', '');
        return;
    }
    $(row).css('background-color', 'orange');
};

function isRowSelected(row){
    if (!isNullOrUndefine(row)) {
        var color =$(row).css('background-color');
        if (color === "rgb(255, 165, 0)"){
            return true;
        }
        return false;
    }
    return false;
};

function isNullOrUndefine(obj){
    if (obj == null){
        return true;
    }
    if (typeof obj == 'undefined'){
        return true;
    }
    return false;
};
