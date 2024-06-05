document.addEventListener("DOMContentLoaded", function() {
    const profileMenuItem = document.querySelector(".menu-item.profile");
    const menuLinks = document.querySelectorAll(".menu-link");
    const headerMenu = document.getElementById("headerMenu");
    const sidebarItems = document.querySelectorAll(".sidebar .menu-item");
    const footerItems = document.querySelectorAll("footer.footer .menu-item");

    // 전화번호 폼 검증 함수
    function validateForm() {
        const phone = document.querySelector('input[name="userPhone"]').value;
        const phonePattern = /^010-\d{4}-\d{4}$/;

        if (!phonePattern.test(phone)) {
            alert('올바른 전화번호 형식이 아닙니다. 010-1234-5678 형식으로 입력해주세요.');
            return false;
        }

        return true;
    }

    // 프로필 메뉴 활성화 함수
    function activateProfileMenuItem() {
        resetIcons();
        profileMenuItem.classList.add("active");
        const img = profileMenuItem.querySelector('img');
        img.src = img.getAttribute('data-active-src');
    }

    profileMenuItem.addEventListener("click", function(event) {
        event.preventDefault();
        activateProfileMenuItem();
    });

    // 활성화된 링크 설정
    function setActiveLink() {
        const currentPath = window.location.pathname;
        menuLinks.forEach(link => {
            const linkPath = new URL(link.href).pathname;
            if (linkPath === currentPath) {
                link.classList.add("active");
            } else {
                link.classList.remove("active");
            }
        });

        // 사이드바 활성화 설정
        setSidebarActiveLink(currentPath);

        // 푸터 활성화 설정
        setFooterActiveLink(currentPath);

        // 현재 경로가 마이페이지 또는 구매이력 경로와 일치하면 프로필 메뉴를 활성화
        if (currentPath === "/mypage" || currentPath === "/purchashistory") {
            activateProfileMenuItem();
            activateFooterProfileItem();
        }
    }

    // 사이드바 활성화된 링크 설정
    function setSidebarActiveLink(currentPath) {
        sidebarItems.forEach(item => {
            const link = item.querySelector('a');
            const linkPath = new URL(link.href).pathname;
            if (linkPath === currentPath) {
                item.classList.add("active");
            } else {
                item.classList.remove("active");
            }
        });
    }

    // 푸터 활성화된 링크 설정
    function setFooterActiveLink(currentPath) {
        footerItems.forEach(item => {
            const link = item.querySelector('a');
            const linkPath = new URL(link.href).pathname;
            if (linkPath === currentPath) {
                item.classList.add("active");
            } else {
                item.classList.remove("active");
            }
        });
    }

    // 푸터 프로필 메뉴 활성화 함수
    function activateFooterProfileItem() {
        footerItems.forEach(item => {
            const link = item.querySelector('a');
            const linkPath = new URL(link.href).pathname;
            if (linkPath === "/mypage" || linkPath === "/purchashistory") {
                item.classList.add("active");
            } else {
                item.classList.remove("active");
            }
        });
    }

    // 메뉴 아이콘 변경
    function changeIcon(element, activeSrc, inactiveSrc) {
        var img = element.querySelector('img');
        var isActive = img.src.includes(activeSrc);
        resetIcons();
        img.src = isActive ? inactiveSrc : activeSrc;
        if (!isActive) {
            element.classList.add('active');
        }
    }

    // 프로필 아이콘 활성화
    function resetIcons() {
        var menuItems = document.querySelectorAll('.menu-item');
        menuItems.forEach(function(item) {
            var img = item.querySelector('img');
            if (img.src.includes('after-')) {
                img.src = img.src.replace('after-', 'before-');
            }
            item.classList.remove('active');
        });

        var profileItems = document.querySelectorAll('.menu-item.profile');
        profileItems.forEach(function(item) {
            item.classList.remove('active');
        });
    }

    function toggleProfileBorder(element) {
        resetIcons();
        element.classList.toggle('active');
    }

    // 홈버튼 눌렀을 때만 메뉴 나오게
    function handleHomeClick(element) {
        var headerMenu = document.getElementById("headerMenu");
        var img = element.querySelector('img');
        var isActive = img.src.includes('/img/after-home.png');
        resetIcons();
        img.src = isActive ? '/img/before-home.png' : '/img/after-home.png';
        if (!isActive) {
            element.classList.add('active');
            headerMenu.style.display = 'flex';
            showPosts(element);
        } else {
            element.classList.remove('active');
            headerMenu.style.display = 'none';
            hidePosts();
        }
    }

    // 사이드바 메뉴
    function changeIconAndHideMenu(element, activeSrc) {
        var img = element.querySelector('img');
        var headerMenu = document.getElementById("headerMenu");
        resetIcons();
        img.src = activeSrc;
        element.classList.add('active');
        headerMenu.style.display = 'none';
        hidePosts();
    }

    function toggleProfileBorderAndHideMenu(element) {
        var headerMenu = document.getElementById("headerMenu");
        resetIcons();
        element.classList.toggle('active');
        headerMenu.style.display = 'none';
        hidePosts();
    }

    // 활성화된 링크 설정 호출
    if (headerMenu) {
        setActiveLink();

        menuLinks.forEach(link => {
            link.addEventListener("click", function(event) {
                event.preventDefault();
                const newPath = this.getAttribute("href");
                window.location.href = newPath; // 페이지를 새로 고침하여 URL을 변경
            });
        });

        window.addEventListener("popstate", setActiveLink);
    }

    // 기본적으로 헤더 메뉴 표시
    if (headerMenu) {
        headerMenu.style.display = 'flex';
    }

    // 폼 검증 추가
    const form = document.querySelector('form');
    if (form) {
        form.onsubmit = validateForm;
    }
});
