package com.example.practice.state.refactor;

/**
 * HotelRoomState 인터페이스는 호텔 객실 상태를 관리하기 위한 메서드들을 정의합니다.
 * 구현 클래스는 이 인터페이스를 구현하여 객실의 상태 전이를 처리할 수 있습니다.
 */
public interface HotelRoomState {
    /**
     * 객실을 예약하는 메서드를 정의합니다.
     * 예약 과정에 따라 구현됩니다.
     */
    void reserveRoom();

    /**
     * 객실에 체크인하는 메서드를 정의합니다.
     * 체크인 과정에 따라 구현됩니다.
     */
    void checkIn();

    /**
     * 객실에서 체크아웃하는 메서드를 정의합니다.
     * 체크아웃 과정에 따라 구현됩니다.
     */
    void checkOut();

    /**
     * 객실 예약을 취소하는 메서드를 정의합니다.
     * 예약 취소 과정에 따라 구현됩니다.
     */
    void cancelReservation();
}
