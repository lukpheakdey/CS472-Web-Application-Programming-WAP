<script>
    function CalculateTip(){
        var subtotal = document.getElementById("subtotal").value;
        var per_tip = document.getElementById("per_tip").value;
        var totalCal = parseFloat(subtotal) + (per_tip/100)*subtotal;
        var totalLabel = document.getElementById("total");
        totalLabel.innerHTML = totalCal;
    }
</script>


