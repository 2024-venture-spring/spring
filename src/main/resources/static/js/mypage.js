document.addEventListener("DOMContentLoaded", function() {
    const profileMenuItem = document.querySelector(".menu-item.profile");

    function activateProfileMenuItem() {
        // 다른 메뉴 비활성화
        resetIcons();

        // 마이페이지 메뉴 활성화
        profileMenuItem.classList.add("active");
        const img = profileMenuItem.querySelector('img');
        img.src = img.getAttribute('data-active-src');

        const headerMenu = document.getElementById("headerMenu");
        headerMenu.style.display = 'none';
        hidePosts();
    }

    profileMenuItem.addEventListener("click", function(event) {
        event.preventDefault();
        activateProfileMenuItem();
    });

    activateProfileMenuItem();
});