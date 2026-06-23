// rightclick.js - Centralized right-click protection with centralized messages
(function() {
    var messages = {
        "home.htm": "ADSL Web by https://github.com/javara",
        "links.htm": "ADSL Web by https://github.com/javara",
        "mail.htm": "ADSL Web by https://github.com/javara",
        "menu.htm": "ADSL Web by https://github.com/javara"
    };

    // Get current filename from URL
    var url = window.location.pathname;
    var filename = url.substring(url.lastIndexOf('/') + 1) || "home.htm";
    var message = messages[filename] || "ADSL Web by https://github.com/javara";

    document.addEventListener('contextmenu', function(e) {
        alert(message);
        e.preventDefault();
    });

    // Retro 2001 fallback code
    window.click = function(e) {
        if (document.all) {
            if (event.button == 2) {
                alert(message);
                return false;
            }
        }
        if (document.layers) {
            if (e.which == 3) {
                alert(message);
                return false;
            }
        }
    };
    if (document.layers) {
        document.captureEvents(Event.MOUSEDOWN);
    }
    document.onmousedown = window.click;
})();